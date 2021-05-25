package interview.Amazon;

import java.util.*;

//        Input:
//        The input to the function/method consists of five arguments - numCompetitors, an integer representing the number of competitors for the Echo device;
//        topNCompetitors, is an integer representing the maximum number of competitors that Amazon wants to identify;
//        competitors, a list of strings representing the competitors;
//        numReviews, an integer representing the number of reviews from different websites that are identified by the automated webcrawler;
//        reviews, a list of string where each element is a string that consists of space-separated words representing user reviews.
//
//        Output:
//        Return a list of strings representing Amazon's top N competitors in order of most frequently mentioned to least frequent.
//
//        Note:
//        The comparison of strings is case-insensitive. If the value of topNCompetitors is more than the number of competitors discussed in the reviews then output the names of only the competitors mention.
//        If competitors have the same count (e.g. newshop=2, shopnow=2, mymarket=4), sort alphabetically. topNCompetitors=2, Output=[mymarket, newshop]
//
//        Example
//        Input:
//        numCompetitors=6
//        topNCompetitors = 2
//        competitors = [newshop, shopnow, afashion, fashionbeats, mymarket, tcellular]
//        numReviews = 6
//        reviews = [
//        "newshop is providing good services in the city; everyone should use newshop",
//        "best services by newshop",
//        "fashionbeats has great services in the city",
//        "I am proud to have fashionbeats",
//        "mymarket has awesome services",
//        "Thanks Newshop for the quick delivery"]
//
//        Output
//        ["newshop", "fashionbeats"]
//
//        Explanation
//        "newshop" is occurring in 3 different reviews. "fashionbeats" is occuring in 2 different user reviews and "mymarket" is occurring in only 1 review.
public class Competitors {
    public static void main(String[] args) {
        int numCompetitors = 6;
        int topNCompetitors = 2;
        int numReviews = 6;
        List<String> competitors = new ArrayList<>(
                Arrays.asList("newshop","shopnow", "afashion", "fashionbeats", "mymarket", "tcellular"));
        List<String> reviews = new ArrayList<>(
                Arrays.asList("newshop is providing good services in the city; everyone should use newshop",
                        "best services by newshop",
                        "fashionbeats has great services in the city",
                        "I am proud to have fashionbeats",
                        "mymarket has awesome services",
                        "Thanks Newshop for the quick delivery"));

        System.out.println(topNumCompetitors(numCompetitors, topNCompetitors, competitors, numReviews, reviews));
    }

    public static List<String> topNumCompetitors(
            int numCompetitors, int topNCompetitors, List<String> competitors,
            int numReviews, List<String> reviews) {

        List<String> result = new ArrayList<>();

        // for fast search
        /*
        Set<String> keywordSet = new HashSet<>();
        for(String keyword: competitors) {
            keywordSet.add(keyword);
        }
        keywordSet.addAll(competitors); // add in bulk
        */

        Set<String> keywordSet = new HashSet<>(competitors);

        Map<String, Integer> count = new HashMap<>();
        for(String review: reviews) {
            Set<String> used = new HashSet<>();

            String[] words = review.toLowerCase().split("\\W");
            for (String word: words) {
                // checks if word is part of the keywords(competitors) and if word is already used in every review cycle
                if(keywordSet.contains(word) && !used.contains(word)) {
                    count.put(word, count.getOrDefault(word, 0) + 1);
                    used.add(word);
                }
            }
        }

        // Max Heap for lexicographical order
        Queue<String> queue = new PriorityQueue<>(
                (a, b) -> (count.get(a) == count.get(b) ? b.compareTo(a) : count.get(a) - count.get(b))
        );

        for (String s: count.keySet()) {
            queue.add(s);
            if (queue.size() > topNCompetitors) {
                queue.poll();
            }
        }

        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }

        Collections.reverse(result);

        return result;
    }

}
