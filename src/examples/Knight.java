package examples;

import java.util.List;

public class Knight {
    private String name;
    private int age;
    private List<String> favoriteBooks;

    public Knight(String name, int age, List<String> favoriteBooks) {
        this.name = name;
        this.age = age;
        this.favoriteBooks = favoriteBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFavoriteBooks() {
        return favoriteBooks;
    }

    public void setFavoriteBooks(List<String> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    @Override
    public String toString() {
        return "Name: " + name + " , Age: " + age + ", Favorite Books: " + favoriteBooks.toString();
    }

}