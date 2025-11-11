public class CacheDemo {
    public static void main(String[] args) {
        // Get cache instance
        CacheManager cache = CacheManager.getInstance();

        // Cache some data
        cache.put("user:john", "John Smith");
        cache.put("user:jane", "Jane Doe");
        cache.put("config:timeout", 3000);

        // Retrieve cached data
        System.out.println("User: " + cache.get("user:john"));
        System.out.println("Config: " + cache.get("config:timeout"));

        // Check if key exists
        if (cache.contains("user:john")) {
            System.out.println("User John is in cache");
        }

        // Get cache from different part of application
        CacheManager sameCache = CacheManager.getInstance();
        System.out.println("Same cache? " + (cache == sameCache));
        System.out.println("Can still access: " + sameCache.get("user:jane"));

        // Clear cache
        cache.clear();
    }
}
