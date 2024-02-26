
;;;-----------------------------
 ;
 ; Clojure package     lv.yu.clz
 ;
 ; Clojure program     CLO_01_frame.clj     Apache License 2.0
 ;
 ; Copyright (c)       Yuri Utkin 2023      mob.+371 12345678     https://www.jago.lv
 ;
 ;;------------------------------

(ns ^{:doc    "Clojure package     lv.yu.clz
               Clojure program     CLO_01_frame.clj     Apache License 2.0
               Copyright (c)       Yuri Utkin 2023      mob.+371 12345678     https://www.jago.lv"
      :author "Yuri Utkin"}

    lv.yu.clz.CLO-01-frame  ;;  CLO-01-frame demonstrates Clojure Frame

  (:require lv.yu.clz.CLO-02-text)
  (:require lv.yu.clz.CLO-03-menu)
  (:require lv.yu.clz.CLO-04-menu-wrap)
  (:require lv.yu.clz.CLO-05-action)
  (:require lv.yu.clz.CLO_06_internal_frame_one)
  (:require lv.yu.clz.CLO_07_internal_frame_six)

  (:import [javax.swing
                       JFrame
                       ImageIcon ]
           [java.awt
                       BorderLayout ]
           [javax.swing
                       WindowConstants
                       SwingUtilities ]

  )  ;;  end import

)  ;;  end ns

;;------------------------------

  (gen-class
    :name lv.yu.clz.CLO_01_frame
    :main true
    :methods [[CLO_01_frame [] void]]
  )

;;------------------------------

(defn initframe [#^JFrame frame]

;;------------------------------

(let [

      imgURL                 (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg"))
      icon_frame (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg")))

     ]

;;------------------------------

    (def title (str "CLOJURE -- CLO_01_frame -- v. 2023.12.12"))

    (doto frame

        (.setTitle (str "     " title))

        (.setBounds (+ 10 (* 0 40) 300) (+ 10 (* 0 40)) 1000 600)

        (.setDefaultCloseOperation WindowConstants/EXIT_ON_CLOSE)

        (.setIconImage (.getImage icon_frame))

        (.setLayout (BorderLayout.))

        (.setVisible true)

;;------------------------------

        (lv.yu.clz.CLO-02-text/CLO_02_text)
        (lv.yu.clz.CLO-03-menu/CLO_03_menu)
        (lv.yu.clz.CLO-04-menu-wrap/CLO_04_menu_wrap)
        (lv.yu.clz.CLO-05-action/CLO_05_action)
        (lv.yu.clz.CLO-06-internal-frame-one/CLO_06_internal_frame_one)
        (lv.yu.clz.CLO-07-internal-frame-six/CLO_07_internal_frame_six)

    )  ;;  end frame

)  ;;  end let

;;------------------------------

)  ;;  end initframe

;;------------------------------

(defn CLO_01_frame [this]

  (let [frame (JFrame.)] (initframe frame) )

)  ;;  end CLO_01_frame []

;;------------------------------

(defn -main [& args]
                    (CLO_01_frame[])

)  ;;  end -main []

;;------------------------------
