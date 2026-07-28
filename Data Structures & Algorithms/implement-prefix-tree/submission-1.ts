class TrieNode {
    children: Map<String, TrieNode> = null
    word: boolean = false
    constructor() {
        this.children = new Map<String, TrieNode>()
        this.word = false;
    }
}
class PrefixTree {
    root: TrieNode = null
    constructor() {
        this.root = new TrieNode()
    }

    /**
     * @param {string} word
     * @return {void}
     */
    insert(word: string): void {
        let curr: TrieNode = this.root
        for(let i = 0; i < word.length; i++){
            let c = word[i]
            if(!curr.children.has(c)) {
                curr.children.set(c, new TrieNode())
            }
            curr = curr.children.get(c)
        }
        curr.word = true
    }

    /**
     * @param {string} word
     * @return {boolean}
     */
    search(word: string): boolean {
        let curr: TrieNode = this.root
        for(let i = 0; i < word.length; i++) {
            let c = word[i]
            if(!curr.children.has(c)){
                return false
            }
            curr = curr.children.get(c)
        }
        return curr.word
    }

    /**
     * @param {string} prefix
     * @return {boolean}
     */
    startsWith(prefix: string): boolean {
        let curr: TrieNode = this.root
        for(let i = 0; i < prefix.length; i++){
            let c = prefix[i]
            if(!curr.children.has(c)){
                return false
            }
            curr = curr.children.get(c)
        }
        return true
    }
}
