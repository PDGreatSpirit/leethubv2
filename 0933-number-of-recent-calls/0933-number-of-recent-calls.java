class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        // Remove requests older than 3000 milliseconds
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        // Add the current request
        requests.offer(t);
        // Return the number of requests within the last 3000 milliseconds
        return requests.size();
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */