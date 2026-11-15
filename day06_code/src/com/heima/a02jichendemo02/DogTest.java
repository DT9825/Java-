package com.heima.a02jichendemo02;

public class DogTest {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.barkHome();
        husky.eat();

        SharPei sharPei = new SharPei();
        sharPei.eat();

        ChineseDog chineseDog = new ChineseDog();
        chineseDog.eat();
    }

}
