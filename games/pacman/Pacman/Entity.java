package Pacman;

public class Entity
{
	private char display;
	private char board;
	private char cherry;
	private char pacman;
	private char ghost1;
	private char ghost2;
	private char ghost3;
	private char ghost4;

	public void set_border_entity(char border_display)
	{
		display = border_display;
	}
	public char get_border_entity()
	{
		return display;
	}

	public void set_board_entity(char middle_board)
	{
		board = middle_board;
	}
	public char get_board_entity()
	{
		return board;
	}

	public void set_pacman(char pacmans)
	{
		pacman = pacmans;
	}
	public char get_pacman()
	{
		return pacman;
	}

	public void set_ghost2(char ghosts2)
	{
		ghost2 = ghosts2;
	}
	public char get_ghost2()
	{
		return ghost2;
	}

	public Entity()
	{
		//char dis = 'X';
		//char pac = 'C';
		//char en1 = '@';
		//char en2 = '#';
		//char en3 = '$';
		//char en4 = '%';
		char bor = '*';
		//set_border_entity(dis);
		//set_pacman(pac);
		set_board_entity(bor);
		//get_board_entity();
	}

	public Entity(char dis)
	{
		set_border_entity(dis);
		get_border_entity();
	}
}