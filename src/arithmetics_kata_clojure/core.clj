(ns arithmetics-kata-clojure.core
  (:require [clojure.string :as str]))

(defn parse-op [raw] (case raw
                       "+" +
                       "-" -
                       "*" *
                       "/" /))

(defn evaluate
  "Parse and evaluate an arithmetic expression"
  [raw]
  (let [tokens (str/split raw #" ")
        [_ lval operand rval _] tokens
        op (parse-op operand)]
    (op (read-string lval) (read-string rval))))
