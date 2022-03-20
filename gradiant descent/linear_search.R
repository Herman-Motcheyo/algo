
library(ggplot2)

###################Descente de gradiant simple###############################################

# objective function
fun <- function(x) {
  x^2
}

# initialize iteration
k <- 0

# initial guess
x <- 5

# gradient of objective function at x
grad <- 2 * x

# initialize vector to hold all x
points <- c()
points[1] <- x

# initialize counter
i <- 2

# start gradient descent algorithm
while (norm(grad, "2") > 10^-4) {
  
  # constant step length alpha
  alpha <- 0.05
  
  # gradient of objective function
  grad <- 2 * x
  
  # search direction
  p <- -grad
  
  # update x until objective funtion value is minimized
  x <- x + alpha * p
  
  # keep track of values of x
  points[i] <- x
  
  # iterations counter
  k <- k + 1
  
  # counter for x
  i <- i + 1
}

# create data frame
data_points <- data.frame(x = points, y = fun(points))

# plot objective function with all x
small_step_length <- ggplot(data.frame(x = c(-5, 5)), aes(x)) +
  stat_function(fun = fun) +
  geom_line(data = data_points, aes(x = x, y = y), col = "blue") +
  geom_point(data = data_points, aes(x = x, y = y), col = "red") +
  theme_minimal() +
  theme(
    axis.text = element_text(size = 12),
    axis.title = element_text(size = 15),
    plot.title = element_text(hjust = 0.5, size = 18)
  ) +
  ylab(expression(x^2)) +
  ggtitle(bquote(atop("Gradient Descent for" ~ x^2, "With Step Length 0.05 and k = 111")))

# initialize iteration
k <- 0

# initial guess
x <- 5

# gradient of objective function at x
grad <- 2 * x

# initialize vector to hold all x
points <- c()
points[1] <- x

# initialize counter
i <- 2

# start gradient descent algorithm
while (norm(grad, "2") > 10^-4) {
  
  # constant step length alpha
  alpha <- 0.7
  
  # gradient of objective function
  grad <- 2 * x
  
  # search direction
  p <- -grad
  
  # update x until objective funtion value is minimized
  x <- x + alpha * p
  
  # keep track of values of x
  points[i] <- x
  
  # iterations counter
  k <- k + 1
  
  # counter for x
  i <- i + 1
}

# create data frame
data_points <- data.frame(x = points, y = fun(points))

big_step_length <- ggplot(data.frame(x = c(-5, 5)), aes(x)) +
  stat_function(fun = fun) +
  geom_line(data = data_points, aes(x = x, y = y), col = "blue") +
  geom_point(data = data_points, aes(x = x, y = y), col = "red") +
  theme_minimal() +
  theme(
    axis.text = element_text(size = 12),
    axis.title = element_text(size = 15),
    plot.title = element_text(hjust = 0.5, size = 18)
  ) +
  ylab(expression(x^2)) +
  ggtitle(bquote(atop("Gradient Descent for" ~ x^2, "With Step Length 0.7 and k = 14")))

ggpubr::ggarrange(small_step_length, big_step_length, ncol = 2)


#################################################### Condition de Woolfe et Armidjo###############"




