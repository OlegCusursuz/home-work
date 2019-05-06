/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kusur
 */
public class Dao {
    static List<Post> posts ;
    static {
        posts = new ArrayList<Post>();
        posts.add(new Post(1, "hello"));
        posts.add(new Post(2, "world"));
        posts.add(new Post(3, "people"));
        
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static void deletePost(int id) {
        for (Post p : posts) {
            if (p.getId() == id) {
                posts.remove(p);
            }
        }
    }

}
