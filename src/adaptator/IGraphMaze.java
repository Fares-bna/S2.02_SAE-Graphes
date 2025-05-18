package adaptator;

import graph.IGraph;
import maze.Maze;

import java.util.List;

public class IGraphMaze<C> implements IGraph<C> {
    private final Maze<C> maze;

    public IGraphMaze(Maze<C> maze) {
        this.maze = maze;
    }

    @Override
    public List<Arc<C>> getSucc(C sommet) {
        return maze.openedNeighbours(sommet).stream()
                .map(neighbor -> new Arc<>(1, neighbor))
                .toList();
    }

}


