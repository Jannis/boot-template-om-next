(ns app.parsing.counter
  (:require [app.reconciler :refer [mutate read]]))

(defmethod read :app/counter
  [{:keys [state]} key _]
  {:value (or (get @state key) 0)})

(defmethod mutate 'app/increment-counter
  [{:keys [state]} _ _]
  {:value [:app/counter]
   :action #(swap! state update :app/counter inc)})
