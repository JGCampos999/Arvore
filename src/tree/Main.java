package tree;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		BinaryTree arvore = new BinaryTree();
		arvore.inserir(arvore.raiz, 50);
		arvore.inserir(arvore.raiz, 40);
		arvore.inserir(arvore.raiz, 60);
		arvore.inserir(arvore.raiz, 35);
		arvore.inserir(arvore.raiz, 45);
		arvore.inserir(arvore.raiz, 55);
		arvore.inserir(arvore.raiz, 65);

		System.out.println(arvore.printTree(arvore.raiz));
		arvore.preOrdem(arvore.raiz);
		System.out.println();
		arvore.inOrdem(arvore.raiz);
		System.out.println();
		arvore.posOrdem(arvore.raiz);
		int i = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor para busca: "));
		if(arvore.buscaElem(arvore.raiz, i, false)) {
			JOptionPane.showMessageDialog(null, "Existe na Árvore");
		} else {
			JOptionPane.showMessageDialog(null, "Não existe na Árvore");
		}
	}

}
