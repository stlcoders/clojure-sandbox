(ns avg.test.core
  (:use [avg.core :as c])
  (:use [clojure.test]))

(deftest test-allofus
  (testing "when-three-items-and-index-one-return-us"
    (is (= [1 2 3] (c/neighborhood [1 2 3] 1))))
  (testing "when-empty-vector-passed-empty-vector-returned"
    (is (= [] (c/neighborhood [] 0))))  
)
