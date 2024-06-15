(ns echo-server
  (:require [maelstrom :as ms]))

(defn add-handlers!
  []
  (ms/add-handler!
    :echo
    (fn [req]
      (ms/reply! req (assoc (:body req) :type "echo_ok")))))

(defn -main
  []
  (add-handlers!)
  (ms/start!))
