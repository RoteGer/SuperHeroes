package com.example.mysuperheroes.models;

public class SuperHeroModel {

   String SuperHeroName;
   String SuperHeroDescription;
   int image;

   public SuperHeroModel(String superHeroName, String superHeroDescription, int image) {
      this.SuperHeroName = superHeroName;
      this.SuperHeroDescription = superHeroDescription;
      this.image = image;
   }

   public String getSuperHeroName() {
      return SuperHeroName;
   }

   public String getSuperHeroDescription() {
      return SuperHeroDescription;
   }

   public int getImage() {
      return image;
   }
}
