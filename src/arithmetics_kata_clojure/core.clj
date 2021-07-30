(ns arithmetics-kata-clojure.core
  (:require [clojure.string :as str]))

(defn parse-op [raw] (case raw
                       "+" +
                       "-" -
                       "*" *
                       "/" /))

(defn read-binop [lval operand rval]
  (let [op (parse-op operand)]
    (op (read-string lval) (read-string rval))))

(defn process-tokens [tokens]
  (let [[_ lval operand rval _] tokens]
    (if (= lval "(")
      "TODO"
      (read-binop lval operand rval))))

(defn evaluate
  "Parse and evaluate an arithmetic expression"
  [raw]
  (process-tokens (str/split raw #" ")))
