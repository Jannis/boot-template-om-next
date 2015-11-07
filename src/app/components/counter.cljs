(ns app.components.counter
  (:require [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]))

(defui Counter
  Object
  (render [this]
    (dom/div #js {:className "counter"}
      (dom/button
        #js {:onClick #(some-> this om/props :increment-fn (apply []))}
        "Increment")
      (dom/p nil "Clicked " (:value (om/props this)) " times"))))

(def counter (om/factory Counter))
