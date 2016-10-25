package de.mkammerer.defaultmap

/**
 * Converts a map to a map which returns a default value for missing keys.
 *
 * @param default Default value.
 * @return Map which returns a default value.
 */
fun <K, V> Map<K, V>.defaultsTo(default: V): DefaultMap<K, V> = DefaultMapImpl(this, default)

/**
 * Like the [Map] interface, only that the [Map.get] call returns a non-null entry.
 */
interface DefaultMap<K, out V> : Map<K, V> {
    override fun get(key: K): V
}

/**
 * A map which returns a default value for missing keys.
 *
 * @param map Map, which contains the values.
 * @param default The default value, which is returned if the key is not found in [map].
 */
class DefaultMapImpl<K, out V>(val map: Map<K, V>, val default: V) : DefaultMap<K, V> {
    override val entries: Set<Map.Entry<K, V>>
        get() = map.entries
    override val keys: Set<K>
        get() = map.keys
    override val size: Int
        get() = map.size
    override val values: Collection<V>
        get() = map.values

    override fun containsKey(key: K) = map.containsKey(key)

    override fun containsValue(value: @kotlin.UnsafeVariance V) = map.containsValue(value)

    override fun get(key: K) = map[key] ?: default

    override fun isEmpty() = map.isEmpty()
}