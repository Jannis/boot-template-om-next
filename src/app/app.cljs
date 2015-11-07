(ns app.app
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [app.parsing.counter]
            [app.reconciler :refer [reconciler]]
            [app.components.counter :refer [counter]]))

(defui App
  static om/IQuery
  (query [this]
    [:app/counter])
  Object
  (render [this]
    (dom/div #js {:className "app"}
      (dom/h1 #js {:className "title"} "Hello!")
      (counter {:value (:app/counter (om/props this))
                :increment-fn
                #(om/transact! this `[(app/increment-counter)])}))))

(defn run []
  (om/add-root! reconciler App (gdom/getElement "app")))
