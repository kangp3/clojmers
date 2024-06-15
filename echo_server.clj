(ns echo-server
  (:require [maelstrom :as msnode]))

(defn -main
  []
  (println "Yayyyyyyyyyyyyyyyyyyyyyyyyyy")
  (msnode/add-handler! :echo (fn [body] (println body)))
  (msnode/start!))
