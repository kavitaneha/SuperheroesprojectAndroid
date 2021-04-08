/*
 * Copyright (C) 2020 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.superheroesproject.model;

public class Hero {

  private final String name;
  private final String photo;
  private final boolean isAvenger;
  private final String description;

  public Hero(String name, String photo, boolean isAvenger, String description) {
    this.name = name;
    this.photo = photo;
    this.isAvenger = isAvenger;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getPhoto() {
    return photo;
  }

  public boolean isAvenger() {
    return isAvenger;
  }

  public boolean getGender();
    return gender;
}

  public String getDescription() {
    return description;
  }
}