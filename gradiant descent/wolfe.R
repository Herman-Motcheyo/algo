fun <- function(x) {
  x^2
}
# initialization of iterations
k <- 0
# initial guess
x <- 5
# gradient at point x
grad <- 2 * x
# search direction
p <- -grad
# initialize vector to hold all x
points <- c()
points[1] <- x
# initialize counter
i <- 2
# set c for Armijo condition
c <- 0.9
# set roh for backtracking algorithm
roh <- 0.95
while (norm(grad, "2") > 10^-4) {
  # set alpha to 1 every time we enter the while loop
  # and cacluate the new alpha for each iteration
  alpha <- 1
  # Armijo condition in while loop
  while (fun(x + alpha * p) > fun(x) + c * alpha * grad * p) {
    alpha <- roh * alpha
  }
  grad <- 2 * x
  p <- -grad
  x <- x + alpha * p
  points[i] <- x
  # update iteration
  k <- k + 1
  # update counter
  i <- i + 1
}
data_points <- data.frame(x = points, y = fun(points))
ggplot(data.frame(x = c(-5, 5)), aes(x)) +
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
  ggtitle(bquote(atop("Gradient Descent for" ~ x^2, "With Backtracking Line Search and k = 104")))



