package ua.antibyte.cinema.service;

import ua.antibyte.cinema.model.MovieSession;
import ua.antibyte.cinema.model.ShoppingCart;
import ua.antibyte.cinema.model.User;

public interface ShoppingCartService {
    /**
     * This method is responsible to add a Ticket to the ShoppingCart
     * @param movieSession Contains the information required for a ticket
     * @param user - user who wan't to buy a ticket for a specific MovieSession
     */
    void addMovieSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
