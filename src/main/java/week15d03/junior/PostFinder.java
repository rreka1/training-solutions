package week15d03.junior;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private final List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (isCorrectPost(post, user)) {
                result.add(post);
            }
        }
        return result;
    }

    private boolean isCorrectPost(Post post, String user) {
        return post.getOwner().equalsIgnoreCase(user) &&
                post.getPublishedAt().isBefore(LocalDate.now()) &&
                isNotEmpty(post.getTitle()) &&
                isNotEmpty(post.getContent());
    }

    private boolean isNotEmpty(String str) {
        return str != null && !str.isBlank();
    }

    public static void main(String[] args) {
        PostFinder postFinder = new PostFinder(List.of(
                new Post("title1", LocalDate.of(2010, 1,1), "content", "owner1"),
                new Post("title2", LocalDate.of(2013, 1,1), "content", "owner2"),
                new Post("title3", LocalDate.of(2030, 1,1), "content", "owner3"),
                new Post(" ", LocalDate.of(2000, 1,1), "content", "owner1"),
                new Post("title4", LocalDate.of(2000, 1,1), "content", "owner2"),
                new Post("title5", LocalDate.of(2000, 1,1), null, "owner3")
        ));

        System.out.println(postFinder.findPostsFor("owner1"));
        System.out.println(postFinder.findPostsFor("owner2"));
        System.out.println(postFinder.findPostsFor("owner3"));
    }
}
