package com.definitelyscala.cordovaplugincamera

import scala.scalajs.js

@js.native
trait CameraPopoverOptions extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  /**
   * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
   * Matches iOS UIPopoverArrowDirection constants.
   *      ARROW_UP : 1,
   *      ARROW_DOWN : 2,
   *      ARROW_LEFT : 4,
   *      ARROW_RIGHT : 8,
   *      ARROW_ANY : 15
   */
  var arrowDir: Double = js.native
}