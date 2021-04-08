package com.karumi.superheroesproject.di;

import com.karumi.superheroesproject.ui.view.MainActivity;
import com.karumi.superheroesproject.ui.view.SuperHeroDetailActivity;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = MainModule.class) public interface MainComponent {

  void inject(MainActivity activity);

  void inject(SuperHeroDetailActivity activity);
}