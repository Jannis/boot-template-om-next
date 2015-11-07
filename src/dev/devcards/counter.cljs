(ns dev.devcards.counter
  (:require [devcards.core :as dc :refer-macros [defcard]]
            [app.components.counter :refer [counter]]))

(defcard counter
  (fn [state _]
    (counter {:value (:counter @state)
              :increment-fn #(swap! state update :counter inc)}))
  {:counter 0}
  {:inspect-data true :history true})
