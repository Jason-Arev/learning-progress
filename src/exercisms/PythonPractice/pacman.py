def eat_ghost(power_pellet_active, touching_ghost):
    if power_pellet_active and touching_ghost:
        return True
    return False


def score(touching_power_pellet, touching_dot):
    return touching_power_pellet or touching_dot


def lose(power_pellet_active, touching_ghost):
    if not power_pellet_active and touching_ghost:
        return True
    return False


def win(has_eaten_all_dots, power_pellet_active, touching_ghost):
    if not power_pellet_active and touching_ghost or not has_eaten_all_dots:
        return False
    elif has_eaten_all_dots:
        return True
    return False
