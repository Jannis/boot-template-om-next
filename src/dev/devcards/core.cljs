(ns dev.devcards.core
  (:require [devcards.core :as dc :refer-macros [start-devcard-ui!]]
            [dev.devcards.counter]))

(enable-console-print!)

(start-devcard-ui!)
