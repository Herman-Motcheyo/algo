from math import exp , tanh

'''
    this file contains all activation funtion that a build

'''

def sigmoide(value):
    '''
       definition of sigmoid function
       value :  represente value of sigmoid function
    '''
    return 1/ (1+ exp( -1 * value))

def tangente(value):
    '''
       definition of hyperbolic tangente function
    '''
    return 1.7159 * tanh(value*(2/3))