(ns avg.test.core
  (:use [avg.core :as c])
  (:use [clojure.test]))

(deftest test-allofus
  (testing "when-three-items-and-index-one-retun-us"
    (is (= 0 0))
    (is (= [1 2 3] (c/allofus [1 2 3] 1)))))
