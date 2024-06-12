package tugasGraph;

import java.util.*;

public class tugasGraph {
    
    // Implementasi BFS
    public List<String> bfs(Map<String, List<String>> graph, String start) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.add(start);
        
        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (!visited.contains(node)) {
                visited.add(node);
                result.add(node);
                for (String neighbor : graph.get(node)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
        return result;
    }

    // Implementasi DFS
    public List<String> dfs(Map<String, List<String>> graph, String start) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        
        stack.push(start);
        
        while (!stack.isEmpty()) {
            String node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                result.add(node);
                for (String neighbor : graph.get(node)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return result;
    }

    // Metode utama untuk menguji implementasi
    public static void main(String[] args) {
        tugasGraph search = new tugasGraph();
        Map<String, List<String>> graph = new HashMap<>();
        
        graph.put("1", Arrays.asList("2", "3"));
        graph.put("2", Arrays.asList("1", "4", "5"));
        graph.put("3", Arrays.asList("1", "6", "7"));
        graph.put("4", Arrays.asList("2"));
        graph.put("5", Arrays.asList("2", "8"));
        graph.put("6", Arrays.asList("3"));
        graph.put("7", Arrays.asList("3"));
        graph.put("8", Arrays.asList("5"));
        
        System.out.println("BFS: " + search.bfs(graph, "1"));
        System.out.println("DFS: " + search.dfs(graph, "1"));
    }
}