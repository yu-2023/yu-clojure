
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
               Clojure program     CLO_02_text.clj      Apache License 2.0
               Copyright (c)       Yuri Utkin 2023      mob.+371 12345678     https://www.jago.lv" 
	  :author "Yuri Utkin"}
	  
	lv.yu.clz.CLO-02-text  ;;  CLO-02-text demonstrates Clojure TextArea in Clojure Frame

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

    (doto frame
    
        (.setTitle (str "     CLOJURE -- CLO_02_text -- v. 2023.01.01"))
     
        (.setBounds (+ 10 (* 1 40) 300) (+ 10 (* 1 40)) 1000 600)
      
        (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)

        (.setIconImage (.getImage icon_frame))
        
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

        Comparative analysis of programming in Java, Kotlin and Clojure.

        How to Program Java, Kotlin, and Clojure Simultaneously.

        Integration of Java, Kotlin and Clojure in one software product.
        
        

        👋👋 RU

        Сравнительный анализ программирование на Java, Kotlin и Clojure.

        Как программировать одновременно на Java, Kotlin и Clojure.

        Интеграция Java, Kotlin и Clojure в одном программном продукте.
      

        
        🌱🌱 LV

        Java, Kotlin un Clojure programmēšanas salīdzinošā analīze.

        Kā programmēt Java, Kotlin un Clojure vienlaicīgi.

        Java, Kotlin un Clojure integrācija vienā programmatūras produktā.
      
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
