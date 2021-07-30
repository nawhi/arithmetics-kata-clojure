(ns arithmetics-kata-clojure.core-test
  (:require [clojure.test :refer :all]
            [arithmetics-kata-clojure.core :refer :all]))

(deftest arithmetics-test
  (testing
    (are [raw expected] (= expected (evaluate raw))
                        "( 0 + 0 )" 0
                        "( 1 + 0 )" 1
                        "( 3 + 0 )" 3
                        "( 1 + 1 )" 2
                        "( 3 + 6 )" 9
                        "( 5 - 3 )" 2
                        "( 5 - 30 )" -25
                        "( 10 * 20 )" 200
                        "( 365 / 5 )" 73
                        "( ( 1 + 2 ) + 3 )" 6
                        )))
