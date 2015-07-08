package imgb.pattern.resources.resource

/**
 * Created by xyz on 6/29/15.
 */
trait LazyAcquireResourceManager extends AcquireReflectionManager{
  private var aquired:Boolean = false
}
