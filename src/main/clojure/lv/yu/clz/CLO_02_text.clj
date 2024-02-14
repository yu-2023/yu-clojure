
;;;-----------------------------
 ;
 ; Clojure package     lv.yu.clz
 ;
 ; Clojure program     CLO_02_text.clj     Apache License 2.0
 ;
 ; Copyright (c)       Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv
 ;
 ;;------------------------------

(ns ^{:doc    "Clojure package     lv.yu.clz
               Clojure program     CLO_02_text.clj     Apache License 2.0
               Copyright (c)       Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv"
      :author "Yuri Utkin"}

    lv.yu.clz.CLO-02-text  ;;  CLO-02-text demonstrates Clojure Text in Clojure Frame

  (:import [javax.swing
                       JFrame
                       ImageIcon
                       JScrollPane
                       JTextArea ]
           [java.awt
                       BorderLayout ]

  )  ;;  end import

)  ;;  end ns

;;------------------------------

  (gen-class
    :name lv.yu.clz.CLO_02_text
    :main true
    :methods [[CLO_02_text [] void]]
  )

;;------------------------------

(defn initframe [#^JFrame frame]

;;------------------------------

(let [

      imgURL                 (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg")) 
      icon_frame (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg")))

     ]

;;------------------------------

    (def title (str "CLOJURE -- CLO_02_text -- v. 2023.12.12"))

    (doto frame

        (.setTitle (str "     " title))

        (.setBounds (+ 10 (* 1 40) 300) (+ 10 (* 1 40)) 1000 600)

        (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)

        (.setIconImage (.getImage icon_frame))

        (.setLayout (BorderLayout.))

        (.setVisible true)

    )  ;;  end frame

)  ;;  end let

;;------------------------------

(let [

      textarea (JTextArea.)
      scrollpane (JScrollPane. textarea)

     ]

      (doto textarea (.setText "

        💞️💞️ EN

        Comparative analysis of programming in Java, Kotlin, Clojure, Groovy, Scala and Jython.

        How to Program Java, Kotlin, Clojure, Groovy, Scala and Jython Simultaneously.

        Integration of Java, Kotlin, Clojure, Groovy, Scala and Jython in one software product.



        👋👋 RU

        Сравнительный анализ программирование на Java, Kotlin, Clojure, Groovy, Scala и Jython.

        Как программировать одновременно на Java, Kotlin, Clojure, Groovy, Scala и Jython.

        Интеграция Java, Kotlin, Clojure, Groovy, Scala и Jython в одном программном продукте.



        🌱🌱 LV

        Java, Kotlin, Clojure, Groovy, Scala un Jython programmēšanas salīdzinošā analīze.

        Kā programmēt Java, Kotlin, Clojure, Groovy, Scala un Jython vienlaicīgi.

        Java, Kotlin, Clojure, Groovy, Scala un Jython integrācija vienā programmatūras produktā.

                               " ) )

      (doto (.getContentPane frame) (.add scrollpane(BorderLayout/CENTER)))

      (doto frame (.setVisible true))

)  ;;  end let

;;------------------------------

)  ;;  end initframe

;;------------------------------

(defn CLO_02_text [this]

  (let [frame (JFrame.)] (initframe frame) )

)  ;;  end CLO_02_text []

;;------------------------------

(defn -main [& args]
                    (CLO_02_text[])
)  ;;  end -main []

;;------------------------------
