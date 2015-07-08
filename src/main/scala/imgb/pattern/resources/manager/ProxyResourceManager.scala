package imgb.pattern.resources.manager

import imgb.pattern.resources.resource.Resource


/**
 * Created by xyz on 7/8/15.
 */
trait ProxyResourceManager[R <:Resource] extends ResourceManager[R]{

  protected def resourceManager:ManagerType

  type ManagerType <:ResourceManager[R]

  override def acquire(): R = resourceManager.acquire()

  override def dispose(resource: R):R= resourceManager.dispose(resource)
}
