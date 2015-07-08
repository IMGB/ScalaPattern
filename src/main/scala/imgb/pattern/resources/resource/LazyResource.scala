package imgb.pattern.resources.resource

import imgb.pattern.resources.manager.ResourceManager

/**
 * Created by xyz on 7/8/15.
 */
class LazyResource[R<:Resource](rm:ResourceManager[R]) extends ProxyResource[R] {

}
