package github.algorithms.hello_world;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Write a program RandomWord.java that reads a sequence of words from standard input
 * and prints one of those words uniformly at random. Do not store the words in an array or list.
 * Instead, use Knuth’s method: when reading the ith word, select it with probability 1/i
 * to be the champion, replacing the previous champion. After reading all of the words, print the
 * surviving champion.
 */
public class RandomWord {
    public static void main(String[] args) {

        String word = null;
        int i = 0;

        while (!StdIn.isEmpty()) {
            String w = StdIn.readString();

            if(w.trim().isEmpty())
                break;

            if (word == null || StdRandom.bernoulli((double) 1 / i))
                word = w;

            i++;
        }

        StdOut.println(word);
    }
}
