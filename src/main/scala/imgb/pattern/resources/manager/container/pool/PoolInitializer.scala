package imgb.pattern.resources.manager.container.pool

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
abstract class PoolInitializer[R <:Resource] {
  def createPool():Pool[R]
}
