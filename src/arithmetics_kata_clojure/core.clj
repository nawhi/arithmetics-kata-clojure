(ns arithmetics-kata-clojure.core
  (:require [clojure.string :as str]))

(defn evaluate
  "Parse and evaluate an arithmetic expression"
  [raw]
  (let [tokens (str/split raw #" ")]
    (+ (Integer/parseInt (nth tokens 1)) (Integer/parseInt (nth tokens 3)))))
