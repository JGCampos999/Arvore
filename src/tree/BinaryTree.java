package tree;

public class BinaryTree {
	public Node raiz;

	public BinaryTree() {
		raiz = null;
	}

	public void inserir(Node p, int valor) {
		if (p == null) {
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) {
			if (p.esq != null) {
				inserir(p.esq, valor);
			} else {
				p.esq = new Node(valor, null, null);
			}
		} else if (valor > p.element) {
			if (p.dir != null) {
				inserir(p.dir, valor);
			} else {
				p.dir = new Node(valor, null, null);
			}
		}
	}

	public String printTree(Node p) {
		String retorno;
		retorno = "(";
		if (p != null) {
			retorno += " " + p.element + " ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno = retorno + ")";
		return retorno;
	}

	public void preOrdem(Node p) {
		if (p != null) {
			System.out.print(p.element + " ");
			preOrdem(p.esq);
			preOrdem(p.dir);
		}
	}

	public void inOrdem(Node p) {
		if (p != null) {
			inOrdem(p.esq);
			System.out.print(p.element + " ");
			inOrdem(p.dir);
		}
	}

	public void posOrdem(Node p) {
		if (p != null) {
			posOrdem(p.esq);
			posOrdem(p.dir);
			System.out.print(p.element + " ");
		}
	}

	public boolean buscaElem(Node p, int valor, boolean verify) {
		if (p != null && !verify) {
			if (p.element == valor) {
				verify = true;
			} else {
				verify = buscaElem(p.esq, valor, verify);
				verify = buscaElem(p.dir, valor, verify);
			}
		}
		return verify;
	}

}
