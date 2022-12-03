; Comments start with semicolons

; this code comes from learnxinyminutes.com

; Clojure is written in "forms", which are just
; lists of things inside parentheses, separated by whitespace.
;
; The clojure reader assumes that the first things is a
; function or macro to call, and the rest are arguments.

; The first call in a file should be ns, to set the namespace
(ns learnclojure)

; More basic examples:

; str will create a string out of all its arguments
(str "Hello" " " "World")

; Math is straightforward
(+ 1 1)
(- 2 1)
(* 1 2)
(/ 2 1)

; Equality is =
(= 1 1)
(= 2 1)

; You need not for logic, too
(not true)

; Nesting forms works as you expect
(+ 1 (- 3 2)) ; 1 + (3 - 2) => 2

;Types
;;;;;;;;;;;;;;;;;;;;

;Clojure uses Java's object types for booleans, strings, and numbers.
; Use `class` to inspect them.
(class 1) ; Integer literals are java.lang.Long by default
(class 1.); Float literals are java.lang.Double
(class ""); Strings always double-quoted, and are java.lang.String
(class false); Booleans are java.lang.Boolean
(class nil); The "null" value is called nil

; If you want to create a literal list of data, use ' to stop it from
; being evaluated
'(+ 1 2)
; (shorthand for (quote (+ 1 2)))

; You can eval a quoted list
(eval '(+ 1 2))

; Collections & Sequences
;;;;;;;;;;;;;;;;;;;;;;;;;;

; Lists are linked-list data structures, while Vectors are array-backed.
; Vectors and Lists are java classes too!
(class [1 2 3])
(class '(1 2 3))

; A list would be written as just (1 2 3), but we have to quote
; it to stop the reader thinking it's a function.
; Also, (list 1 2 3) is the same as '(1 2 3)

; "Collections" are just groups of datra
; Both lists and vectors are collections:
(coll? '(1 2 3))
(coll? [1 2 3])

; "Sequences" (seqs) are abstract descriptions of lists of data.
; Only lists are seqs.
(seq? '(1 2 3))
(seq? [ 1 2 3])


; A seq need only provide an entry when it is accessed.
; So, seqs which can be lazy -- they can define infinite series:
(range 4)
(range)
(take 4 (range))

; Use cons to add an item to the beginning of a list or vector
(cons 4 [1 2 3])
(cons 4 '(1 2 3))

; Conj will add an item to a collection in the most efficient way.
; For lists, they inset at the beggining. For vectors, they insert at the end.
(conj [1 2 3] 4)
(conj '(1 2 3) 4)

; Use concat to add lists or vectors together
(concat [1 2] '(3 4))

; Use filter, map to interact with collections
(map inc [1 2 3])
(filter even? [1 2 3])

; Use reduce to reduce them
(reduce + [1 2 3 4])

; Reduce can take an initial-value argument too
(reduce conj [] '(3 2 1))

; Functions
;;;;;;;;;;;;;;;
