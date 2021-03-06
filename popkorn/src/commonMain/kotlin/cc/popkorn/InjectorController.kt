package cc.popkorn

import kotlin.reflect.KClass

/**
 * Interface with the available methods to manage injections
 *
 * @author Pau Corbella
 * @since 1.0.0
 */
interface InjectorController {

    fun <T : Any> addInjectable(instance: T, type: KClass<out T> = instance::class, environment: String? = null)

    fun <T : Any> removeInjectable(type: KClass<T>, environment: String? = null)

    fun <T : Any> inject(clazz: KClass<T>, environment: String? = null): T

    fun <T : Any> injectNullable(clazz: KClass<T>, environment: String? = null): T?

    fun purge()

    fun reset()

}