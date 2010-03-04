(in-package "CYC")

(csetq *silent-progress?* t) ;this removes some printouts
(csetq *dump-verbose* NIL) ;this removes some printouts

(system-code-initializations); 

(print (load-kb "ext/cyc-tiny/"))
;(print (load-kb "ext/rtiny/"))

;; System parameters
(load-system-parameters)

;; CycL code initializations, includes KB-dependent initializations
(system-code-initializations)

;; this should be the very last step
(csetq *init-file-loaded?* t)

(initialize-larkc)
(start-sparql-server)


;;;;;;;;;;;;;;;;;;;;;THE FOLLOWING ENABLES OPENCYC API;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define robust-enable-tcp-server (type port handler)
  (pif (fboundp 'enable-tcp-server)
       ;; new way
       (ret (enable-tcp-server type port))
       ;; old way
       (ret (sl::start-tcp-server port handler nil))))

(csetq *base-tcp-port* 3600)
(progn
  (print "Enabling base TCP services to port 3600")
  (finish-output))

(robust-enable-tcp-server
 :cyc-api (api-port) 'api-server-top-level)
;; CFASL server
(robust-enable-tcp-server
 :cfasl (cfasl-port) 'cfasl-server-top-level)
