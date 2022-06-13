public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ольга";
        post.passport = "4208 № 87342834";
        post.patronymic = "Борисовна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Орлова";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 10;
        post.birthday.year = 1990;

    }
}
