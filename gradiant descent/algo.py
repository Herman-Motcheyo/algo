

import numpy as np
import math


#retoure l'image de f suivant un point p
def f(p):
    return 1/2*pow(p[0] , 2) + 7/2* pow(p[1],2)

#retourne le gradiant de f
def grad_f(p):
    return [p[0] ,7*p[1]]

#calcule la norme du vecteur
def norme(v):
    return math.sqrt(pow(v[0] , 2) + math.pow(v[1],2))

def somme(v1, v2):
    return [v1[0] + v2[0], v1[1]+v2[1]]

def soustraction(v1, v2):
    return [v1[0] - v2[0], v1[1]-v2[1]]

def grad_f_negatif(p):
    return [-p[0] ,-7*p[1]]


# x0 point de ou commence l'algorithme
# s represente le pas
# e represente la precision
def descente_a_pas_fixe(e , x0, s):
    k=0
    while( norme(grad_f(x0)) >  e):
        dk = grad_f_negatif(x0)
        x0 = somme(x0,  multiplication(s,dk ))
        k = k+1
    return x0


def descente_a_pas_fixe_sta_solution(e , x0, s):
    k=0
    xk = x0
    xk_1 = x0
    while( stagnation_valeur_courante(xk_1,xk) < e*norme(xk)  ):
        dk = grad_f_negatif(x0)
        a = xk_1
        xk_1 = somme(xk, multiplication(s,dk))
        k = k+1
        print(k)
    return x0

def s(x):
    return (pow(x[0],2) + pow(7,2)*pow(x[1] , 2)) /(pow(x[0],2) + pow(7,3)*pow(x[1] , 2))
 
def multiplication( a , x):
    return [a*x[0], a*x[1]]

def descentePasOptimal(e , x0):

    data = {
        "k":0,
         "f(xk,yk)" : 0,
         "sk":0,
         "xk":0,
         "yk":0
    }
    x = [data]
    xk = x0
    k=0
    #norme(grad_f(x0))<=e
    while(norme(grad_f(xk)) > e):
        dk = grad_f_negatif(xk)
        print(dk)
        xk = somme(xk, multiplication(s(xk),dk ))
        print(k +1)
        k = k+1

    return xk


    #############################################################################################
def rebrouissement(sk_1 , xk ,dk):
    sk = sk_1
    while( f(somme(xk ,multiplication(sk,dk)))  >= f(xk)   ):
        sk = sk /2
    return sk

def descente_a_pas_fixe_rebroussement(e , x0, s):
    k=0
    xk = x0
    while( norme(grad_f(x0)) >  e):
        dk = grad_f_negatif(xk)
        s= rebrouissement(s,xk,dk)
        xk = somme(xk, multiplication(s,dk))
        k = k+1
    return xk

#print(s([7,1.5]))
#print(grad_f_negatif([7,1.5]))
#print(descente_a_pas_fixe_rebroussement(10e-5 ,[7,1.5],0.25))
#print ( ) 
#print(f( [7,1.5]))
#print(descente_a_pas_fixe(10e-5 ,[7,1.5],0.325))
print(descente_a_pas_fixe_sta_solution(10e-5 ,[7,1.5],0.125))
