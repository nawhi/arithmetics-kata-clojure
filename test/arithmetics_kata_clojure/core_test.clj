(ns arithmetics-kata-clojure.core-test
  (:require [clojure.test :refer :all]
            [arithmetics-kata-clojure.core :refer :all]))

(deftest adder-test
  (testing "add"
    (is (= (evaluate "0 + 0") 0))))
