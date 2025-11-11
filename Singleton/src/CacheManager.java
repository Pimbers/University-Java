import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheManager {
    private Map<String, Object> cache;

    private CacheManager() {
        cache = new ConcurrentHashMap<>();
        System.out.println("Cache initialised");
    }

    private static class SingletonHelper {
        private static final CacheManager INSTANCE = new CacheManager();
    }

    public static CacheManager getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
        System.out.println("Cached: " + key);
    }

    public Object get(String key) {
        Object value = cache.get(key);
        System.out.println("Retrieved from cache: " + key);
        return value;
    }

    public boolean contains(String key) {
        return cache.containsKey(key);
    }

    public void clear() {
        cache.clear();
        System.out.println("Cache cleared");
    }
}

