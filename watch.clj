(require '[cljs.build.api :as b])

(b/watch "src"
  {:output-to    "main.js"
   :output-dir   "out"
   :main         'hello-es6.core
   :target       :nodejs
   :foreign-libs [{:file "lib-a" :module-type :es6}
                  {:file "lib-b" :module-type :es6}]
   :verbose      true})
