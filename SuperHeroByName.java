package com.karumi.katasuperheroes.usecase;

import android.os.Handler;
import android.os.Looper;
import com.karumi.superheroesproject.model.SuperHero;
import com.karumi.superheroesproject.model.SuperHeroesRepository;
import javax.inject.Inject;

public class GetSuperHeroByName {

  private final SuperHeroesRepository repository;

  @Inject public GetSuperHeroByName(SuperHeroesRepository repository) {
    this.repository = repository;
  }

  public void get(final String name, final Callback callback) {
    new Thread(new Runnable() {
      @Override public void run() {
        loadSuperHeroByName(name, callback);
      }
    }).start();
  }

  private void loadSuperHeroByName(String name, final Callback callback) {
    final SuperHero superHero = repository.getByName(name);
    new Handler(Looper.getMainLooper()).post(new Runnable() {
      @Override public void run() {
        callback.onSuperHeroLoaded(superHero);
      }
    });
  }

  public interface Callback {

    void onSuperHeroLoaded(SuperHero superHero);
  }
}