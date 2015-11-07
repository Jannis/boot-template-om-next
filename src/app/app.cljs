(ns app.app
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [app.reconciler :refer [reconciler]]
            [app.parsing.counter]))

(defui App
  static om/IQuery
  (query [this]
    [:app/counter])
  Object
  (render [this]
    (dom/div #js {:className "app"}
      (dom/h1 #js {:className "title"} "Hello!")
      (dom/p nil
        (dom/button #js {:onClick #(om/transact! this
                                                 `[(app/increment-counter)])}
          "Click me!"))
      (dom/p nil "Clicked " (:app/counter (om/props this)) " times"))))

(defn run []
  (om/add-root! reconciler App (gdom/getElement "app")))
