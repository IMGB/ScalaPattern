package imgb.pattern.resources.manager.containermanager

import imgb.pattern.resources.manager.ResourceManager
import imgb.pattern.resources.manager.container.Container
import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/9/15.
 */
trait ContainerManager[R <:Resource] extends ResourceManager[R] with Container[R]{

  def contained(resource: R):Boolean

  abstract override def dispose(resource: R): R = {
    if(contained(resource)) {
      input(resource).get
    }else{
      super.dispose(resource)
    }
  }
}
