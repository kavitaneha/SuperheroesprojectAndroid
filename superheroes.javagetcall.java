package com.karumi.superheroesproject.usecase;

import android.os.Handler;
import android.os.Looper;
import com.karumi.katasuperheroes.model.SuperHero;
import com.karumi.katasuperheroes.model.SuperHeroesRepository;
import java.util.List;
import javax.inject.Inject;

public class GetSuperHeroes {

  private final SuperHeroesRepository repository;

  @Inject public GetSuperHeroes(SuperHeroesRepository repository) {
    this.repository = repository;
  }

  public void getAll(final Callback callback) {
    new Thread(new Runnable() {
      @Override public void run() {
        loadSuperHeroes(callback);
      }
    }).start();
  }

  private void loadSuperHeroes(final Callback callback) {
    final List<SuperHero> superHeroes = repository.getAll();
    new Handler(Looper.getMainLooper()).post(new Runnable() {
      @Override public void run() {
        callback.onSuperHeroesLoaded(superHeroes);
      }
    });
  }

  public interface Callback {

    void onSuperHeroesLoaded(List<SuperHero> superHeroes);
  }
}